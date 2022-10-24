package fr.lernejo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SampleTest {
    @Test
    void op() {
        Sample sample = new Sample();
        Assertions.assertThat(sample.op(Sample.Operation.ADD, 4, 6)).isEqualTo(10);
        Assertions.assertThat(sample.op(Sample.Operation.MULT, 4, 6)).isEqualTo(24);
    }

    @Test
    void fact() {
        Sample sample = new Sample();
        Assertions.assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(() -> sample.fact(-1));
        Assertions.assertThat(sample.fact(0)).isEqualTo(1);
        Assertions.assertThat(sample.fact(1)).isEqualTo(1);
        Assertions.assertThat(sample.fact(2)).isEqualTo(2);
        Assertions.assertThat(sample.fact(3)).isEqualTo(6);
        Assertions.assertThat(sample.fact(4)).isEqualTo(24);
        Assertions.assertThat(sample.fact(5)).isEqualTo(120);
        Assertions.assertThat(sample.fact(6)).isEqualTo(720);
    }
}
