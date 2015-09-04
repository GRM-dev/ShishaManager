package pl.grm.sm.desktop;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Desktop extends JFrame {
	private JPanel contentPane;
	private MenuGłówne menu;
	private Kalendarz kalendarz;

	public Desktop() {
		super();
		contentPane = new JPanel();
		setContentPane(contentPane); // <---- ustawia contentPane jako główny
										// panel programu/okna
		menu = new MenuGłówne(this);
		zmieńStronę(Strona.MENUGŁÓWNE);
		kalendarz = new Kalendarz();
		pack();
	}

	public void zmieńStronę(Strona strona) {
		contentPane.removeAll();

		switch (strona) {
			case KALENDARZ :
				contentPane.add(kalendarz);
				break;
			case MENUGŁÓWNE :
				contentPane.add(menu);
				break;
			case SHISHABARY :
				break;
			case TYTONIE :
				break;
			case WYDATKI :
				break;
			default :
				break;
		}
		revalidate();
		contentPane.revalidate();
		pack();
	}
}
