package microservice.book.socialmultiplication.domain;

public class Multiplication {

    private int factorA;
    private int factorB;
    private int results;


    public Multiplication(int factorA, int factorB) {
        this.factorA = factorA;
        this.factorB = factorB;
        this.results = factorA * factorB;
    }


    public int getFactorA() {
        return factorA;
    }

    public void setFactorA(int factorA) {
        this.factorA = factorA;
    }

    public int getFactorB() {
        return factorB;
    }

    public void setFactorB(int factorB) {
        this.factorB = factorB;
    }

    public int getResults() {
        return results;
    }

    public void setResults(int results) {
        this.results = results;
    }


    @Override
    public String toString() {
        return "Multiplication{" +
                "factorA=" + factorA +
                ", factorB=" + factorB +
                ", results(A * B)=" + results +
                '}';
    }
}
