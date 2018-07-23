package com.ing.mercatus.tixclient.program;

import com.ing.mercatus.tixclient.TixClientApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.contract.stubrunner.spring.AutoConfigureStubRunner;
import org.springframework.cloud.contract.stubrunner.spring.StubRunnerProperties;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = TixClientApplication.class)
@AutoConfigureStubRunner(stubsMode = StubRunnerProperties.StubsMode.LOCAL,
        ids = { "com.ing.mercatus:tix-stub:+:9999" })
public class ProgramClientTest {


    @Autowired
    private ProgramClient programClient;
    @Test
    public void shouldFindProductById() {
        //When
        ProgramDTO found = programClient.retrieve("1");
        //Then
        assertThat(found.getId()).isEqualTo(1);
        assertThat(found.getName()).isEqualTo("program name");
    }

    @Test
    public void shouldFindProducts() {
        //When
        List<ProgramDTO> found = programClient.retrieveAll();
        //Then
        assertThat(found).hasSize(2);
    }
}