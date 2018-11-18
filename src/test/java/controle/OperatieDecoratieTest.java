package controle;

import kerstmis.LichtslingerElf;
import kerstmis.LuidsprekerElf;
import kerstmis.TreintjeElf;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;


public class OperatieDecoratieTest {

    @Test
    public void zetVersieringenAan_en_UitTest() {
        OperatieDecoratie operatieDecoratie = new OperatieDecoratie();
        LichtslingerElf lichtslingerElf = new LichtslingerElf();
        LuidsprekerElf luidsprekerElf = new LuidsprekerElf();
        TreintjeElf treintjeElf = new TreintjeElf();
        operatieDecoratie.voegVersieringToe(lichtslingerElf);
        operatieDecoratie.voegVersieringToe(luidsprekerElf);
        operatieDecoratie.voegVersieringToe(treintjeElf);

        operatieDecoratie.zetVersieringenAan();

        assertThat(lichtslingerElf.isLampenAan()).isTrue();
        assertThat(luidsprekerElf.getVolume()).isEqualTo(11);
        assertThat(treintjeElf.getSnelheid()).isEqualTo(50.5);

        operatieDecoratie.zetVersieringenUit();

        assertThat(lichtslingerElf.isLampenAan()).isFalse();
        assertThat(luidsprekerElf.getVolume()).isEqualTo(2);
        assertThat(treintjeElf.getSnelheid()).isEqualTo(-5);
    }

    @Test
    public void voegVersieringToe_nietMeerDan4Test() {
        OperatieDecoratie operatieDecoratie = new OperatieDecoratie();
        operatieDecoratie.voegVersieringToe("dit");
        operatieDecoratie.voegVersieringToe("is");
        operatieDecoratie.voegVersieringToe("lelijke");
        operatieDecoratie.voegVersieringToe("code");

        assertThatThrownBy(() -> operatieDecoratie.voegVersieringToe("!"))
                .isInstanceOf(RuntimeException.class)
                .hasMessage("Geen walkie-talkies meer over van de set!");
    }


}