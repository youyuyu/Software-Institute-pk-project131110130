package ChineseChess;
//�������ģ��
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChineseChese extends JFrame {
	public static int AI=-1;
	static CheseMap chesemap=new CheseMap();
	public CheseMan[][]cheseman=chesemap.getCheseman();
	

	public ChineseChese() {
		
		add(chesemap);
		for(int i=0;i<cheseman.length;i++){
			for(int j=0;j<cheseman[i].length;j++){
				cheseman[i][j].addMouseListener(new Controller(cheseman,chesemap));
			}
		}
		
		
		
	}

	public static void main(String[] args) {
		
		Object[] possibleValues = { "�˻���ս", "˫�˶�ս" }; 
		String selectedValue = (String)JOptionPane.showInputDialog(null, "��ս��ʽ", "��սģʽѡ��", 
		JOptionPane.INFORMATION_MESSAGE, null, 
		possibleValues, possibleValues[0]);
		ChineseChese frame = new ChineseChese();
		if(selectedValue.contentEquals("�˻���ս")){
			AI=1;
		}
		frame.setResizable(false);
		frame.setTitle("�й�����");
		frame.setSize(507, 590);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		
		
	}

}
