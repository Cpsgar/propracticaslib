package es.mdef.propracticaslib;

public class PracticaDefensaImpl extends PracticaImpl implements PracticaDefensa {
	
	private boolean solicitudPreviaJCISAT;
	private String hps;
	
	public Tipo_Practica getTipoPractica() {
		return Tipo_Practica.Defensa;
	}
	
	public boolean isSolicitudPreviaJCISAT() {
		return solicitudPreviaJCISAT;
	}
	public void setSolicitudPreviaJCISAT(boolean solicitudPreviaJCISAT) {
		this.solicitudPreviaJCISAT = solicitudPreviaJCISAT;
	}
	public String getHps() {
		return hps;
	}
	public void setHps(String hps) {
		this.hps = hps;
	}
}
