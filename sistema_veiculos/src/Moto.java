public class Moto extends Automotores {
    //Definição dos atributos privados
    private double cilindrada;
    private double torque;

    //Definição dos construtores públicos
    public Moto(){}

    public Moto(double cilindrada, double torque){
        this.cilindrada=cilindrada;
        this.torque=torque;
    }

    //Getters e setters dos atributos da moto
    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) throws AtributoInvalidoException {
        //Condicional de validação, que caso a cilindrada sera menor ou igual a 0, dará erro
        if(cilindrada <= 0){
            throw new AtributoInvalidoException("O valor de cilindrada digitado é inválido ou deve ser maior que 0");
        }
        else{
            this.cilindrada = cilindrada;
        }
    
    }

    public double getTorque() {
        return torque;
    }

    public void setTorque(double torque) throws AtributoInvalidoException {
        //Condicional de validação, que caso o torque seja menor que 5, dará erro
        if(torque < 5){
            throw new AtributoInvalidoException("O valor do torque digitado deve ser superior ou igual a 5.");
        }
        else{
            this.torque = torque;
        }
        
    }

    //Método string que retorna as informações da superclasse adicionando as informações dos atributos específicos
    @Override
    public String descricao(){
        return "\nDados da Moto: "+super.descricao() + "\nCilindradas: "+getCilindrada()+" cc" + "\n"+
        "Torque: "+getTorque() +" N.m";
    }
    
}
