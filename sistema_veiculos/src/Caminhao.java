public class Caminhao extends Automotores {
    //Definição dos atributos privados
    private int qntd_eixo;
    private double peso_bruto;

    //Definição dos construtores públicos
    public Caminhao(){}

    public Caminhao(int qntd_eixo, double peso_bruto){
        this.qntd_eixo=qntd_eixo;
        this.peso_bruto=peso_bruto;

    }

    //getters e setters dos atributos do caminhão
    public int getQntd_eixo() {
        return qntd_eixo;
    }

    public void setQntd_eixo(int qntd_eixo) throws AtributoInvalidoException {
        //Condicional de validação, que caso a quantidade de eixo seja menor que 2, dará erro
        if(qntd_eixo<2){
            throw new AtributoInvalidoException("A quantidade de eixos deve ser maior ou igual a 2");
        }
        else{
            this.qntd_eixo = qntd_eixo;
        }
    }

    public double getPeso_bruto() {
        return peso_bruto;
    }

    public void setPeso_bruto(double peso_bruto) throws AtributoInvalidoException {
        //Condicional de validação, que caso o peso bruto do caminhão seja maior que 46.6 (toneladas), dará erro
        if(peso_bruto > 46.6){
            throw new AtributoInvalidoException("O valor digitado é maior que o permitido ou é inválido");
        }
        this.peso_bruto = peso_bruto;
    }

    //Método string que retorna as informações da superclasse adicionando as informações dos atributos específicos
    @Override
    public String descricao(){
        return "\nDados do caminhao: "+super.descricao() + "\nQuantidade de eixos: "+ getQntd_eixo() + "\n" +
        "Peso bruto: "+getPeso_bruto()+"(T)";
    }
    
}
