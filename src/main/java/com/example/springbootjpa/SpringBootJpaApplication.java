package com.example.springbootjpa;

import com.example.springbootjpa.domain.Journal;
import com.example.springbootjpa.repository.JournalRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootJpaApplication implements CommandLineRunner {

    @Autowired
    private JournalRepository journalRepository;

    @Override
    public void run(String... args) throws Exception {
        journalRepository.save(new Journal("스프링 부트 입문","스프링 공부 시작","02/06/2018"));
        journalRepository.save(new Journal("스프링 프로젝트 샘플","스프링 샘플!","02/07/2018"));
        journalRepository.save(new Journal("스프링 부트 구조","스프링 구조를 알아보자","02/08/2018"));
        journalRepository.save(new Journal("스프링 부트 클라우드","클라우드요","02/09/2018"));
    }
    //
//    @Bean
//    InitializingBean saveData(JournalRepository repo) {
//        return () ->{
//            repo.save(new Journal("스프링 부트 입문","스프링 공부 시작","02/06/2018"));
//            repo.save(new Journal("스프링 프로젝트 샘플","스프링 샘플!","02/07/2018"));
//            repo.save(new Journal("스프링 부트 구조","스프링 구조를 알아보자","02/08/2018"));
//            repo.save(new Journal("스프링 부트 클라우드","클라우드요","02/09/2018"));
//        };
//        //InitializingBean은 스프링 엔진이 인스턴스 생성 후 초기화 할 때 항상 호출하는 특수 클래스
//        //saveData는 스프링 시동 준비전에 실행
//    }

    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger("SpringBootJpaApplication");
        logger.debug("Hello Spring Boot");

        logger.info("Starting Spring Boot!");
        SpringApplication.run(SpringBootJpaApplication.class, args);
    }

}

/* Development URL List **
 * 관리용
   - http://localhost:8080/swagger-ui.html : Swagger-ui
   - http://localhost:8080/h2-console/ : h2-console
 * 샘플
   - Json : http://localhost:8080/journal
   - CRUD : http://localhost:8080/users
   - template HTML : http://localhost:8080/
   - Properties : http://localhost:8080/testConfig

 */

