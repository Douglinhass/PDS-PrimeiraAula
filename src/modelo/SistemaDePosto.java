package modelo;

public class SistemaDePosto {
	
	private float precoOleo1;
	private float precoOleo500;
	private float quantidadeOleo1;
	private float quantidadeOleo500;
	private float quantidadeLitros;
	private float valorPagarOleo1;
	private float valorPagarOleo500;
	private float totalOleo;
	private float totalCombustivel;
	private int dias;
	private float total;
	
	public void calcularCombustivel(SistemaDePosto p, Combustivel c) {
		float total = p.getQuantidadeLitros() * c.getPreco();
		p.setTotalCombustivel(total);
	}
	
	public void calcularValorPagarOleo1(SistemaDePosto p) {
		p.setValorPagarOleo1(p.getQuantidadeOleo1() * p.getPrecoOleo1());
	}
	
	public void calcularValorPagarOleo500(SistemaDePosto p) {
		p.setValorPagarOleo500(p.getQuantidadeOleo500() * p.getPrecoOleo500());
	}
	
	public void calcularTotalOleo(SistemaDePosto p) {
		p.setTotalOleo(p.getValorPagarOleo1() + p.getValorPagarOleo500());
	}
	
	public void calcularTotalVista(SistemaDePosto p) {
		float total = p.totalCombustivel + p.totalOleo;
		float desconto = total * 0.1f;
		p.setTotal(total - desconto);
	}
	
	public void calcularTotalPrazo(SistemaDePosto p) {
		float total = p.totalCombustivel + p.totalOleo;
		if(p.getDias() <= 30) {
			p.setTotal(total);
		}
		if(p.getDias() > 30) {
			float juros = total * 0.1f;
			p.setTotal(total + juros);
		}
	}
	
	public float getPrecoOleo1() {
		return precoOleo1;
	}
	public void setPrecoOleo1(float precoOleo1) {
		this.precoOleo1 = precoOleo1;
	}
	public float getPrecoOleo500() {
		return precoOleo500;
	}
	public void setPrecoOleo500(float precoOleo500) {
		this.precoOleo500 = precoOleo500;
	}
	public float getQuantidadeOleo1() {
		return quantidadeOleo1;
	}
	public void setQuantidadeOleo1(float quantidadeOleo1) {
		this.quantidadeOleo1 = quantidadeOleo1;
	}
	public float getQuantidadeOleo500() {
		return quantidadeOleo500;
	}
	public void setQuantidadeOleo500(float quantidadeOleo500) {
		this.quantidadeOleo500 = quantidadeOleo500;
	}
	public float getQuantidadeLitros() {
		return quantidadeLitros;
	}
	public void setQuantidadeLitros(float quantidadeLitros) {
		this.quantidadeLitros = quantidadeLitros;
	}
	public float getValorPagarOleo1() {
		return valorPagarOleo1;
	}
	public void setValorPagarOleo1(float valorPagarOleo1) {
		this.valorPagarOleo1 = valorPagarOleo1;
	}
	public float getValorPagarOleo500() {
		return valorPagarOleo500;
	}
	public void setValorPagarOleo500(float valorPagarOleo500) {
		this.valorPagarOleo500 = valorPagarOleo500;
	}
	public float getTotalOleo() {
		return totalOleo;
	}
	public void setTotalOleo(float totalOleo) {
		this.totalOleo = totalOleo;
	}
	public int getDias() {
		return dias;
	}
	public void setDias(int dias) {
		this.dias = dias;
	}
	public float getTotal() {
		return total;
	}
	public void setTotal(float total) {
		this.total = total;
	}

	public float getTotalCombustivel() {
		return totalCombustivel;
	}

	public void setTotalCombustivel(float totalCombustivel) {
		this.totalCombustivel = totalCombustivel;
	}



}