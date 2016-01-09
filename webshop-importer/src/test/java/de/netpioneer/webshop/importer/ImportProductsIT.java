package de.netpioneer.webshop.importer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by skobow on 08.01.2016.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:webshop-importer-context.xml"})
public class ImportProductsIT {

    @Autowired
    private JobLauncher jobLauncher;

    @Autowired
    private Job job;

    @Test
    public void shouldImportProducts() throws Exception {
        JobParameters jobParameters = new JobParametersBuilder()
                .addString("inputResource", "file:C:\\Entwicklung\\projects\\spring-batch-tectalk-sample\\data\\products.zip")
                .addString("targetDirectory", "./work/output/")
                .addString("targetFile", "products.csv")
                .toJobParameters();

        JobExecution execution = jobLauncher.run(job, jobParameters);
        assertTrue("Job executed with errors!", execution.getAllFailureExceptions().isEmpty());
    }
}
