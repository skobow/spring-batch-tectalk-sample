package de.netpioneer.webshop.importer;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.Properties;

/**
 * Created by skobow on 06.01.2016.
 */
public class ImporterCli {
    private static final Logger Log = LogManager.getLogger(ImporterCli.class);

    public static void main(String[] args) {
        String fileName = System.getProperty("filename");

        new ImporterCli().run(fileName);
    }

    public void run(String fileName) {
        if (StringUtils.isEmpty(fileName)) {
            throw new IllegalArgumentException("Filename may not be empty!");
        }
    }
}
