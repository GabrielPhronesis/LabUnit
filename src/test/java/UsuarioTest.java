/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.testeunit.Usuario;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
Gustavo Rodriguez Braghetti     TIA : 32057725​
Gabriel Soares Diniz                  TIA : 32049536​
Gabriel Penella Chequer             TIA : 32040377​
Lucas Pereira Pires                    TIA : 32078935
 */
public class UsuarioTest {
    
    public UsuarioTest() {
    }

    
    
    Usuario novoUsuario = new Usuario();
    
    @org.junit.jupiter.api.Test
    public void testSomeMethod() {
        fail("The test case is a prototype.");
    }
    
    @Test
    public void testex1(){
        assertEquals("Data inválida", novoUsuario.classificaIdade(1899));
        assertEquals("Data válida", novoUsuario.classificaIdade(1900));
        assertEquals("Data inválida", novoUsuario.classificaIdade(2023));
        
        assertEquals("Data válida", novoUsuario.classificaIdade(1901));
        assertEquals("Data válida", novoUsuario.classificaIdade(2021));
        assertEquals("Data válida", novoUsuario.classificaIdade(2022));
    }
   
    @Test
    public void testex2(){
        assertEquals("Nota inválida", novoUsuario.classificaNota(-2));
        assertEquals("Nota válida", novoUsuario.classificaNota(2));
        assertEquals("Nota inválida", novoUsuario.classificaNota(12));
        
        assertEquals("Nota inválida", novoUsuario.classificaNota(-1));
        assertEquals("Nota válida", novoUsuario.classificaNota(0));
        assertEquals("Nota válida", novoUsuario.classificaNota(1));
        assertEquals("Nota válida", novoUsuario.classificaNota(9));
        assertEquals("Nota válida", novoUsuario.classificaNota(10));
        assertEquals("Nota inválida", novoUsuario.classificaNota(11));

    }
    
    @Test
    public void testex3(){
        assertEquals("10 anos", novoUsuario.classificaMotorista(25));
        assertEquals("5 anos", novoUsuario.classificaMotorista(55));
        assertEquals("3 anos", novoUsuario.classificaMotorista(73));
        
        assertEquals("10 anos", novoUsuario.classificaMotorista(49));
        assertEquals("5 anos", novoUsuario.classificaMotorista(50));
        assertEquals("5 anos", novoUsuario.classificaMotorista(51));
        assertEquals("5 anos", novoUsuario.classificaMotorista(69));
        assertEquals("3 anos", novoUsuario.classificaMotorista(70));
        assertEquals("3 anos", novoUsuario.classificaMotorista(71));
       
    }
}
