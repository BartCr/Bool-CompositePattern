package controle;

import kerstmis.LichtslingerElf;
import kerstmis.LuidsprekerElf;
import kerstmis.TreintjeElf;

import java.util.ArrayList;
import java.util.List;

public class OperatieDecoratie {

    private List<Object> walkieTalkieSet;

    public OperatieDecoratie() {
        walkieTalkieSet = new ArrayList<>();
    }

    public void voegVersieringToe(Object versieringElf) {
        if(walkieTalkieSet.size() >= 4) {
            throw new RuntimeException("Geen walkie-talkies meer over van de set!");
        }
        walkieTalkieSet.add(versieringElf);
    }

    public void zetVersieringenAan() {
        for(Object versieringElf : walkieTalkieSet) {
            if(versieringElf instanceof LichtslingerElf) {
                ((LichtslingerElf) versieringElf).setLampenAan(true);
            }
            if(versieringElf instanceof LuidsprekerElf) {
                ((LuidsprekerElf) versieringElf).setVolume(11);
            }
            if(versieringElf instanceof TreintjeElf) {
                ((TreintjeElf) versieringElf).setSnelheid(50.5);
            }
        }
    }

    public void zetVersieringenUit() {
        for(Object versieringElf : walkieTalkieSet) {
            if(versieringElf instanceof LichtslingerElf) {
                ((LichtslingerElf) versieringElf).setLampenAan(false);
            }
            if(versieringElf instanceof LuidsprekerElf) {
                ((LuidsprekerElf) versieringElf).setVolume(2);
            }
            if(versieringElf instanceof TreintjeElf) {
                ((TreintjeElf) versieringElf).setSnelheid(-5);
            }
        }
    }
}
