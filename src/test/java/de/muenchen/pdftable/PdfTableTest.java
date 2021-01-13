package de.muenchen.pdftable;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.File;
import java.io.IOException;

@SpringBootTest(
        classes = {PdfTableApplication.class}
)
@Slf4j
public class PdfTableTest {

    // This is where the File is created
    @Autowired
    PdfService pdfService;


    @Test
    public void createTestPdf() throws IOException {

        FileUtils.writeByteArrayToFile(new File("foo.pdf"), pdfService.getTestPdf());
    }

}