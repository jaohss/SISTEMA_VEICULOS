public class Automotores extends Veiculos {
    //Definição dos atributos privados
    private String montadora;
    private double kilometragem;

    //Definição dos construtores públicos
    public Automotores(){}

    public Automotores( String montadora, double kilometragem){
        this.montadora=montadora;
        this.kilometragem=kilometragem;
    }

    //Getters e setters dos atributos dos automotores
    public String getMontadora() {
        return montadora;
    }

    public void setMontadora(String montadora) throws AtributoInvalidoException {
        //Condicional de validação, que caso o atributo seja nulo dará erro
        if(montadora == null || montadora.trim().isEmpty()){
            throw new AtributoInvalidoException("A montadora não pode ser nula");
        }
        else{
            this.montadora = montadora;
        }
    }

    public double getKilometragem() {
        return kilometragem;
    }

    public void setKilometragem(double kilometragem) throws AtributoInvalidoException {
        //Condicional de validação, que caso a kilometragem seja menor que 0, dará erro
        if(kilometragem < 0){
            throw new AtributoInvalidoException("A kilometragem do veículo deve ser maior ou igual a 0");
        }
        else{
            this.kilometragem = kilometragem;
        }
    }

    //Método string que retorna as informações da superclasse adicionando as informações dos atributos específicos
    @Override
    public String descricao(){
        return super.descricao() + "\nMontadora: "+getMontadora() + "\n"+
        "Kilometragem: "+getKilometragem() +"(km)";
    }
}
