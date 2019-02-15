package br.com.guairaca.estrutural.Bridge;

public abstract class Publicacao {
	private BridgePublicacao bridgePublicacao;

	public BridgePublicacao getBridgePublicacao() {
		return bridgePublicacao;
	}

	public void setBridgePublicacao(BridgePublicacao bridgePublicacao) {
		this.bridgePublicacao = bridgePublicacao;
	}
}
