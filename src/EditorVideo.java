// Gerente é um funcionario, por isso herda os atributos  métodos da classe Funcionario
public class EditorVideo extends Funcionario {

	public double getBonificacao() {
		System.out.println("chamando metodo de bonificacao do editor de video");
		return super.getBonificacao() + 100;

	}

}
