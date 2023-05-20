import org.example.Candidato;
import org.example.Vaga;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CandidatoTest {

    @Test
    public void deveNotificarUmCandidato(){
        Vaga vaga = new Vaga("Front", 2000.0F, 2);
        Candidato candidato = new Candidato("João");
        candidato.candidatar(vaga);
        vaga.lancarResultado();
        assertEquals("João, cadidatura atualizada para: Vaga{cargo='Front', salario=2000.0, vagas=2}", candidato.getUltimaNotificacao());
    }

    @Test
    public void deveNotificarCandidatos(){
        Vaga vaga = new Vaga("Front", 2000.0F, 2);
        Candidato candidato1 = new Candidato("João");
        Candidato candidato2 = new Candidato("Pedro");
        candidato1.candidatar(vaga);
        candidato2.candidatar(vaga);
        vaga.lancarResultado();
        assertEquals("João, cadidatura atualizada para: Vaga{cargo='Front', salario=2000.0, vagas=2}", candidato1.getUltimaNotificacao());
        assertEquals("Pedro, cadidatura atualizada para: Vaga{cargo='Front', salario=2000.0, vagas=2}", candidato2.getUltimaNotificacao());
    }

    @Test
    public void naoDeveNotificarUmCandidato(){
        Vaga vaga = new Vaga("Front", 2000.0F, 2);
        Candidato candidato = new Candidato("João");
        vaga.lancarResultado();
        assertEquals(null, candidato.getUltimaNotificacao());
    }

    @Test
    public void deveNotificarCandidatosFront(){
        Vaga vaga1 = new Vaga("Front", 2000.0F, 2);
        Vaga vaga2 = new Vaga("Back", 2000.0F, 2);
        Candidato candidato1 = new Candidato("João");
        Candidato candidato2 = new Candidato("Pedro");
        candidato1.candidatar(vaga1);
        candidato2.candidatar(vaga2);
        vaga1.lancarResultado();
        assertEquals("João, cadidatura atualizada para: Vaga{cargo='Front', salario=2000.0, vagas=2}", candidato1.getUltimaNotificacao());
        assertEquals(null, candidato2.getUltimaNotificacao());
    }


}
