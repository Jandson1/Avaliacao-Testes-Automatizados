package service;

import builder.CelularProvider;
import model.Celular;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class CelularServiceImplTest {

    @Mock
    private CargaDispositivo cargaDispositivo;

    @InjectMocks
    private CelularServiceImpl celularService;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    @DisplayName("Deve mostrar o volume do celular corretamente")
    public void mostrarVolumeCorretamente() throws Exception {
        System.out.println("testeDeveMostrarVolume");
        // Given
        Celular celular1 = CelularProvider.get();

        // When
        celularService.ligar(celular1);
        celularService.desbloquear(celular1, celular1.isDesbloqueado());
        celularService.volumeAtual(celular1);

        // Then
        Assertions.assertEquals(5, celular1.getVolumeAtual());
    }

    @Test
    @DisplayName("O volume do celular deve aumentar corretamente")
    public void aumentarVolumeCorretamente() throws Exception {
        System.out.println("testeDeveAumentarVolume");
        // Given
        Celular celular1 = CelularProvider.get();

        // When
        celularService.ligar(celular1);
        celularService.desbloquear(celular1, celular1.isDesbloqueado());
        celularService.aumentarVolume(celular1, 3);

        // Then
        Assertions.assertEquals(8, celular1.getVolumeAtual());
    }

    @Test
    @DisplayName("O volume do celular deve diminuir corretamente")
    public void diminuirVolumeCorretamente() throws Exception {
        System.out.println("testeDeveDiminuirVolume");
        // Given
        Celular celular1 = CelularProvider.get();

        // When
        celularService.ligar(celular1);
        celularService.desbloquear(celular1, celular1.isDesbloqueado());
        celularService.diminuirVolume(celular1, 3);

        // Then
        Assertions.assertEquals(2, celular1.getVolumeAtual());
    }

    @Test
    @DisplayName("O volume do celular não pode ser negativo")
    public void testeVolumeNaoPodeSerNegativo() throws Exception {
        System.out.println("testeVolumwNaoPodeSerNegativo");

        // Given
        Celular celular1 = CelularProvider.get();

        // When
        celularService.ligar(celular1);
        celularService.desbloquear(celular1, celular1.isDesbloqueado());
        celularService.diminuirVolume(celular1, 10);

        // Then
        Assertions.assertEquals(0, celular1.getVolumeAtual());
    }

    @Test
    @DisplayName("O celular deve desligar corretamente")
    public void deveDesligarOCelularCorretamente() throws Exception {
        System.out.println("deveDesligarOCarroCorretamente");

        // Given
        Celular celular1 = CelularProvider.get();

        // When
        celularService.ligar(celular1);
        celularService.desligar(celular1);

        // Then
        Assertions.assertFalse(celular1.isLigado());
    }

    @Test
    @DisplayName("O celular deve ligar corretamente")
    public void deveLigarOCelularCorretamente() throws Exception {
        System.out.println("deveLigarOCarroCorretamente");

        // Given
        Celular celular1 = CelularProvider.get();

        // When
        celularService.ligar(celular1);

        // Then
        Assertions.assertTrue(celular1.isLigado());
    }
    @Test
    @DisplayName("O celular deve desbloquear corretamente")
    public void deveDesbloquearOCelularCorretamente() throws Exception {
        System.out.println("deveDesbloquearOCarroCorretamente");

        // Given
        Celular celular1 = CelularProvider.get();

        // When
        celularService.ligar(celular1);
        celularService.desbloquear(celular1,true);

        // Then
        Assertions.assertTrue(celular1.isDesbloqueado());
    }
}
