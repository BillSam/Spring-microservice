package microservice.book.socialmultiplication.service;

import microservice.book.socialmultiplication.domain.Multiplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MultiplicationServiceTest {

    @MockBean
    private RandomGeneratorService randomGeneratorService;

    @Autowired
    private MultiplaicationService multiplaicationService;



    @Test
    public void createRandomMultiplicationTest(){

        given(randomGeneratorService.generateRandomFactor()).willReturn(50,30);

        Multiplication multiplication = multiplaicationService.createRandomMultiplication();

        assertThat(multiplication.getFactorA()).isEqualTo(50);
        assertThat(multiplication.getFactorB()).isEqualTo(30);
        assertThat(multiplication.getResults()).isEqualTo(1500);
    }
}
