
public class SistemaVeiculosApp{
    public static void main(String[] args) {

        //Entrada de dados
        try{
            //Dados de Bicicleta
        Bicicleta b1 = new Bicicleta();
        b1.setAno_fabri("2020");
        b1.setCor("Azul");
        b1.setMarca("Monark");
        b1.setMaterial("Aço");
        b1.setModelo("Super mega bike");
        b1.setQntd_marchas(2);
        
        //Dados do Skate
        Skate s1 = new Skate();
        s1.setAno_fabri("1970");
        s1.setCor("Amarelo");
        s1.setMarca("Mercedez");
        s1.setModelo("Rebaixado");
        s1.setTipo_roda("Redonda");

        //Automotores

        //Dados do Caminhão
        Caminhao c1 = new Caminhao();
        c1.setAno_fabri("2020");
        c1.setCor("Vermelho");
        c1.setKilometragem(12.5);
        c1.setModelo("Onibus");
        c1.setMontadora("Volvo");
        c1.setPeso_bruto(35);
        c1.setQntd_eixo(10);

        //Dados da moto
        Moto m1 = new Moto();
        m1.setAno_fabri("2012");
        m1.setModelo("XRE");
        m1.setCor("Amarelo-preto");
        m1.setKilometragem(55);
        m1.setCilindrada(65.4);
        m1.setMontadora("Honda Motors");
        m1.setTorque(45);

        //Dados do carros
        Carro car = new Carro();
        car.setAno_fabri("2020");
        car.setCor("Vermelho");
        car.setModelo("Celta");
        car.setKilometragem(45.8);
        car.setMontadora("Chevrolet");
        car.setQntd_passageiros(4);
        car.setTipo_airbag("central");
        car.setTipo_freio("Freio ABS");

        //Saída de dados
        System.out.println(c1.descricao());
        System.out.println(s1.descricao());
        System.out.println(b1.descricao());
        System.out.println(car.descricao());
        System.out.println(m1.descricao());
        }

        //Exibição da mensagem de erro em caso de falha
        catch (AtributoInvalidoException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        

    }
} 