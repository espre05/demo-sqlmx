package demo.sqlmx;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import demo.sqlmx.domain.CategoryCode;
import demo.sqlmx.domain.CategoryCodeRepository;

@Component
public class AppStartupRunner implements ApplicationRunner {
    private static final Logger log = LoggerFactory.getLogger(AppStartupRunner.class);
    
    @Autowired
    CategoryCodeRepository categoryCodeRepo;
    
    @Override
    public void run(ApplicationArguments args) throws Exception {
        log.info("Your application started with option names : {}", args.getOptionNames());
        List<CategoryCode> catCodes = categoryCodeRepo.findAll();
        log.info("catCodes" +catCodes);
    }
}