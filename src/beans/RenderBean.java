package beans;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class RenderBean {
	private int state;

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}
	
}
