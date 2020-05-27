package ge.cse.jpademo.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

// 1. ჩართვისას დაბილდვის დროს შემოდის აქ.
@EnableWebSecurity    // Enable configs configs. This annotation denotes configs for spring configs.
public class SecurityCredentialsConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private JwtAuthenticationEntryPoint jwtAuthenticationEntryPoint;

    @Qualifier("userDetailsServiceImpl")
    @Autowired
    private UserDetailsService userDetailsService;

    @Autowired
    private JwtConfig jwtConfig;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .csrf().disable()
                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                .and()
                .exceptionHandling().authenticationEntryPoint(jwtAuthenticationEntryPoint)
                .and()
                .addFilter(new JwtUsernameAndPasswordAuthenticationFilter(authenticationManager(), jwtConfig))
                .addFilterAfter(new JwtTokenAuthenticationFilter(jwtConfig), UsernamePasswordAuthenticationFilter.class)
                .authorizeRequests()
                .antMatchers(HttpMethod.POST, jwtConfig.getUri()).permitAll()
                .antMatchers(HttpMethod.GET, "/swagger-ui.html/**", "/v2/api-docs", "/webjars/**", "/swagger-resources/**", "/configuration/**").permitAll()// swagger ი რომ ჩატვირთოს .

                .antMatchers(HttpMethod.POST, "/api/generateJWT/**").permitAll()


                .antMatchers(HttpMethod.POST, "/api/CommentController/**").permitAll() // ყველას აქვს კომენტარის დამატების უფლება
                .antMatchers(HttpMethod.POST,"/api/PostController/posts/**").permitAll()
                .antMatchers(HttpMethod.POST,"/api/PostController/post/detail/**").permitAll()
                .antMatchers(HttpMethod.POST,"/api/RoleController/**").permitAll()
                .antMatchers(HttpMethod.POST,"/api/AppUserController/**").permitAll()
                   //ადმინის წვდომები
                .antMatchers("/api/PostController/**").hasRole("ADMIN")
                .antMatchers("/api/CategoryController/**").hasRole("ADMIN")
                .antMatchers("/api/CommentController/**").hasRole("ADMIN")



                // წვდომების დასრულება
                .anyRequest().authenticated();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
    }

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public JwtConfig jwtConfig() {
        return new JwtConfig();
    }

}
