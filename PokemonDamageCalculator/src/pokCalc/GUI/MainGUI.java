package pokCalc.GUI;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Slider;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;

public class MainGUI {
	private Text txtPok1Level;
	private Text txtPok1CurrHPNum;
	private Text txtPok1CurrHPPer;
	private Text txtPok1HP;
	private Text txtPok1Atk;
	private Text txtPok1Def;
	private Text txtPok1SpAtk;
	private Text txtPok1SpDef;
	private Text txtPok1Speed;
	private Text txtPok2Level;
	private Text txtPok2CurrHPNum;
	private Text txtPok2CurrHPPer;
	private Text txtPok2HP;
	private Text txtPok2Atk;
	private Text txtPok2Def;
	private Text txtPok2SpAtk;
	private Text txtPok2SpDef;
	private Text txtPok2Speed;
	private TabFolder pokCalcFolder;

	protected Shell shell;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			MainGUI window = new MainGUI();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(455, 409);
		shell.setText("Pokemon Damage Calculator");
		
		pokCalcFolder = new TabFolder(shell, SWT.NONE);
		pokCalcFolder.setBounds(0, 1, 455, 391);
		
		createDamageGroup();
		createPokemon1Group();
		createPokemon2Group();
		createFieldGroup();
	}
	public void createPokemon1Group() {

		TabItem tabPokemon1 = new TabItem(pokCalcFolder, SWT.NONE);
		tabPokemon1.setText("Pokemon 1");

		Composite cmpPokemon1 = new Composite(pokCalcFolder, SWT.NONE);
		tabPokemon1.setControl(cmpPokemon1);

		Label lblPok1Name = new Label(cmpPokemon1, SWT.NONE);
		lblPok1Name.setBounds(10, 10, 60, 14);
		lblPok1Name.setText("Pokemon");

		Combo cmbPok1Name = new Combo(cmpPokemon1, SWT.NONE);
		cmbPok1Name.setBounds(76, 6, 139, 22);

		Label lblLevelPok1 = new Label(cmpPokemon1, SWT.NONE);
		lblLevelPok1.setBounds(221, 10, 38, 14);
		lblLevelPok1.setText("Level");

		txtPok1Level = new Text(cmpPokemon1, SWT.BORDER);
		txtPok1Level.setText("100");
		txtPok1Level.setBounds(255, 7, 30, 19);

		Label lblPok1Type = new Label(cmpPokemon1, SWT.NONE);
		lblPok1Type.setBounds(10, 30, 60, 18);
		lblPok1Type.setText("Type");

		Combo cmbPok1Type1 = new Combo(cmpPokemon1, SWT.NONE);
		cmbPok1Type1.setBounds(76, 26, 75, 22);

		Combo cmbPok1Type2 = new Combo(cmpPokemon1, SWT.NONE);
		cmbPok1Type2.setBounds(157, 26, 75, 22);

		Label lblPok1CurrHp = new Label(cmpPokemon1, SWT.NONE);
		lblPok1CurrHp.setBounds(238, 30, 60, 14);
		lblPok1CurrHp.setText("Curr HP");

		txtPok1CurrHPNum = new Text(cmpPokemon1, SWT.BORDER);
		txtPok1CurrHPNum.setText("000");
		txtPok1CurrHPNum.setBounds(292, 27, 28, 19);

		Label lblPok1CurrHPMax = new Label(cmpPokemon1, SWT.NONE);
		lblPok1CurrHPMax.setBounds(320, 30, 28, 14);
		lblPok1CurrHPMax.setText("/000");

		Label lblPok1PerBounds = new Label(cmpPokemon1, SWT.NONE);
		lblPok1PerBounds.setBounds(354, 30, 60, 14);
		lblPok1PerBounds.setText("(           %)");

		txtPok1CurrHPPer = new Text(cmpPokemon1, SWT.BORDER);
		txtPok1CurrHPPer.setText("100");
		txtPok1CurrHPPer.setBounds(364, 27, 30, 19);

		Label lblPok1Hp = new Label(cmpPokemon1, SWT.NONE);
		lblPok1Hp.setBounds(10, 70, 60, 14);
		lblPok1Hp.setText("HP");

		Label lblPok1Attack = new Label(cmpPokemon1, SWT.NONE);
		lblPok1Attack.setBounds(10, 98, 60, 14);
		lblPok1Attack.setText("Attack");

		Label lblPok1Defense = new Label(cmpPokemon1, SWT.NONE);
		lblPok1Defense.setBounds(10, 125, 60, 14);
		lblPok1Defense.setText("Defense");

		Label lblPok1SpAtk = new Label(cmpPokemon1, SWT.NONE);
		lblPok1SpAtk.setBounds(10, 153, 60, 14);
		lblPok1SpAtk.setText("Sp. Atk");

		Label lblPok1SpDef = new Label(cmpPokemon1, SWT.NONE);
		lblPok1SpDef.setBounds(10, 181, 60, 14);
		lblPok1SpDef.setText("Sp. Def");

		Label lblPok1Speed = new Label(cmpPokemon1, SWT.NONE);
		lblPok1Speed.setBounds(10, 209, 60, 14);
		lblPok1Speed.setText("Speed");

		Label lblPok1Base = new Label(cmpPokemon1, SWT.NONE);
		lblPok1Base.setBounds(76, 50, 38, 14);
		lblPok1Base.setText("Base");

		Label lblPok1BaseHP = new Label(cmpPokemon1, SWT.NONE);
		lblPok1BaseHP.setBounds(76, 70, 28, 14);
		lblPok1BaseHP.setText("00");

		Label lblPok1BaseAtk = new Label(cmpPokemon1, SWT.NONE);
		lblPok1BaseAtk.setBounds(76, 98, 28, 14);
		lblPok1BaseAtk.setText("00");

		Label lblPok1BaseDef = new Label(cmpPokemon1, SWT.NONE);
		lblPok1BaseDef.setBounds(76, 125, 28, 14);
		lblPok1BaseDef.setText("00");

		Label lblPok1BaseSpAtk = new Label(cmpPokemon1, SWT.NONE);
		lblPok1BaseSpAtk.setBounds(76, 153, 28, 14);
		lblPok1BaseSpAtk.setText("00");

		Label lblPok1BaseSpDef = new Label(cmpPokemon1, SWT.NONE);
		lblPok1BaseSpDef.setBounds(76, 181, 28, 14);
		lblPok1BaseSpDef.setText("00");

		Label lblPok1BaseSpeed = new Label(cmpPokemon1, SWT.NONE);
		lblPok1BaseSpeed.setBounds(76, 209, 28, 14);
		lblPok1BaseSpeed.setText("00");

		Label lblPok1Ivs = new Label(cmpPokemon1, SWT.NONE);
		lblPok1Ivs.setBounds(117, 50, 28, 14);
		lblPok1Ivs.setText("IV's");

		Combo cmbPok1IVHP = new Combo(cmpPokemon1, SWT.READ_ONLY);
		enterIVs(cmbPok1IVHP);
		cmbPok1IVHP.setBounds(117, 67, 48, 22);

		Combo cmbPok1IVAtk = new Combo(cmpPokemon1, SWT.READ_ONLY);
		enterIVs(cmbPok1IVAtk);
		cmbPok1IVAtk.setBounds(117, 94, 48, 22);

		Combo cmbPok1IVDef = new Combo(cmpPokemon1, SWT.READ_ONLY);
		enterIVs(cmbPok1IVDef);
		cmbPok1IVDef.setBounds(117, 121, 48, 22);

		Combo cmbPok1IVSpAtk = new Combo(cmpPokemon1, SWT.READ_ONLY);
		enterIVs(cmbPok1IVSpAtk);
		cmbPok1IVSpAtk.setBounds(117, 149, 48, 22);

		Combo cmbPok1IVSpDef = new Combo(cmpPokemon1, SWT.READ_ONLY);
		enterIVs(cmbPok1IVSpDef);
		cmbPok1IVSpDef.setBounds(117, 177, 48, 22);

		Combo cmbPok1IVSpeed = new Combo(cmpPokemon1, SWT.READ_ONLY);
		enterIVs(cmbPok1IVSpeed);
		cmbPok1IVSpeed.setBounds(117, 205, 48, 22);

		Label lblPok1Evs = new Label(cmpPokemon1, SWT.NONE);
		lblPok1Evs.setBounds(167, 50, 60, 14);
		lblPok1Evs.setText("EV's");

		Slider sldrPok1HP = new Slider(cmpPokemon1, SWT.NONE);
		sldrPok1HP.setIncrement(4);
		sldrPok1HP.setMaximum(252);
		sldrPok1HP.setBounds(171, 69, 105, 15);

		Slider sldrPok1Atk = new Slider(cmpPokemon1, SWT.NONE);
		sldrPok1Atk.setIncrement(4);
		sldrPok1Atk.setMaximum(252);
		sldrPok1Atk.setBounds(171, 97, 105, 15);

		Slider sldrPok1Def = new Slider(cmpPokemon1, SWT.NONE);
		sldrPok1Def.setIncrement(4);
		sldrPok1Def.setMaximum(252);
		sldrPok1Def.setBounds(171, 124, 105, 15);

		Slider sldrPok1SpAtk = new Slider(cmpPokemon1, SWT.NONE);
		sldrPok1SpAtk.setIncrement(4);
		sldrPok1SpAtk.setMaximum(252);
		sldrPok1SpAtk.setBounds(171, 152, 105, 15);

		Slider sldrPok1SpDef = new Slider(cmpPokemon1, SWT.NONE);
		sldrPok1SpDef.setIncrement(4);
		sldrPok1SpDef.setMaximum(252);
		sldrPok1SpDef.setBounds(171, 180, 105, 15);

		Slider sldrPok1Speed = new Slider(cmpPokemon1, SWT.NONE);
		sldrPok1Speed.setIncrement(4);
		sldrPok1Speed.setMaximum(252);
		sldrPok1Speed.setBounds(171, 208, 105, 15);

		txtPok1HP = new Text(cmpPokemon1, SWT.BORDER);
		txtPok1HP.setText("000");
		txtPok1HP.setBounds(281, 67, 30, 19);

		txtPok1Atk = new Text(cmpPokemon1, SWT.BORDER);
		txtPok1Atk.setText("000");
		txtPok1Atk.setBounds(282, 95, 30, 19);

		txtPok1Def = new Text(cmpPokemon1, SWT.BORDER);
		txtPok1Def.setText("000");
		txtPok1Def.setBounds(282, 122, 30, 19);

		txtPok1SpAtk = new Text(cmpPokemon1, SWT.BORDER);
		txtPok1SpAtk.setText("000");
		txtPok1SpAtk.setBounds(282, 150, 30, 19);

		txtPok1SpDef = new Text(cmpPokemon1, SWT.BORDER);
		txtPok1SpDef.setText("000");
		txtPok1SpDef.setBounds(282, 178, 30, 19);

		txtPok1Speed = new Text(cmpPokemon1, SWT.BORDER);
		txtPok1Speed.setText("000");
		txtPok1Speed.setBounds(282, 206, 30, 19);

		Combo cmbPok1ModHP = new Combo(cmpPokemon1, SWT.READ_ONLY);
		enterMods(cmbPok1ModHP);
		cmbPok1ModHP.setBounds(366, 67, 48, 25);

		Combo cmbPok1ModAtk = new Combo(cmpPokemon1, SWT.READ_ONLY);
		enterMods(cmbPok1ModAtk);
		cmbPok1ModAtk.setBounds(366, 94, 48, 25);

		Combo cmbPok1ModDef = new Combo(cmpPokemon1, SWT.READ_ONLY);
		enterMods(cmbPok1ModDef);
		cmbPok1ModDef.setBounds(366, 121, 48, 25);

		Combo cmbPok1ModSpAtk = new Combo(cmpPokemon1, SWT.READ_ONLY);
		enterMods(cmbPok1ModSpAtk);
		cmbPok1ModSpAtk.setBounds(366, 149, 48, 25);

		Combo cmbPok1ModSpDef = new Combo(cmpPokemon1, SWT.READ_ONLY);
		enterMods(cmbPok1ModSpDef);
		cmbPok1ModSpDef.setBounds(366, 177, 48, 25);

		Combo cmbPok1ModSpeed = new Combo(cmpPokemon1, SWT.READ_ONLY);
		enterMods(cmbPok1ModSpeed);
		cmbPok1ModSpeed.setBounds(366, 205, 48, 25);

		Label lblPok1Mods = new Label(cmpPokemon1, SWT.NONE);
		lblPok1Mods.setBounds(360, 50, 33, 14);
		lblPok1Mods.setText("Mods");

		Label lblPok1Nature = new Label(cmpPokemon1, SWT.NONE);
		lblPok1Nature.setBounds(10, 237, 60, 14);
		lblPok1Nature.setText("Nature");

		Label lblPok1Ability = new Label(cmpPokemon1, SWT.NONE);
		lblPok1Ability.setBounds(10, 265, 60, 14);
		lblPok1Ability.setText("Ability");

		Label lblPok1Item = new Label(cmpPokemon1, SWT.NONE);
		lblPok1Item.setBounds(10, 293, 60, 14);
		lblPok1Item.setText("Item");

		Combo cmbPok1Nature = new Combo(cmpPokemon1, SWT.NONE);
		cmbPok1Nature.setBounds(76, 233, 124, 25);

		Combo cmbPok1Ability = new Combo(cmpPokemon1, SWT.NONE);
		cmbPok1Ability.setBounds(76, 261, 124, 22);

		Combo cmbPok1Item = new Combo(cmpPokemon1, SWT.NONE);
		cmbPok1Item.setBounds(76, 289, 124, 22);

		Combo cmbPok1Status = new Combo(cmpPokemon1, SWT.READ_ONLY);
		cmbPok1Status.setItems(new String[] {"Healthy", "Poisoned", "Badly Poisoned", "Burned", "Paralyzed", "Asleep", "Frozen"});
		cmbPok1Status.setBounds(76, 317, 124, 25);
		cmbPok1Status.select(0);

		Label lblPok1Status = new Label(cmpPokemon1, SWT.NONE);
		lblPok1Status.setBounds(10, 321, 60, 14);
		lblPok1Status.setText("Status");

		Combo cmbPok1Move1 = new Combo(cmpPokemon1, SWT.NONE);
		cmbPok1Move1.setBounds(206, 233, 160, 22);

		Combo cmbPok1Move2 = new Combo(cmpPokemon1, SWT.NONE);
		cmbPok1Move2.setBounds(206, 261, 160, 22);

		Combo cmbPok1Move3 = new Combo(cmpPokemon1, SWT.NONE);
		cmbPok1Move3.setBounds(206, 289, 160, 22);

		Combo cmbPok1Move4 = new Combo(cmpPokemon1, SWT.NONE);
		cmbPok1Move4.setBounds(206, 317, 160, 22);

		Button btnPok1Crit1 = new Button(cmpPokemon1, SWT.CHECK);
		btnPok1Crit1.setBounds(372, 234, 53, 18);
		btnPok1Crit1.setText("Crit");

		Button btnPok1Crit2 = new Button(cmpPokemon1, SWT.CHECK);
		btnPok1Crit2.setText("Crit");
		btnPok1Crit2.setBounds(372, 262, 53, 18);

		Button btnPok1Crit3 = new Button(cmpPokemon1, SWT.CHECK);
		btnPok1Crit3.setText("Crit");
		btnPok1Crit3.setBounds(372, 290, 53, 18);

		Button btnPok1Crit4 = new Button(cmpPokemon1, SWT.CHECK);
		btnPok1Crit4.setText("Crit");
		btnPok1Crit4.setBounds(372, 317, 53, 18);

		Label lblPok1Total = new Label(cmpPokemon1, SWT.NONE);
		lblPok1Total.setBounds(320, 50, 60, 14);
		lblPok1Total.setText("Total");

		Label lblPok1TotHP = new Label(cmpPokemon1, SWT.NONE);
		lblPok1TotHP.setText("00");
		lblPok1TotHP.setBounds(320, 70, 28, 14);

		Label lblPok1TotAtk = new Label(cmpPokemon1, SWT.NONE);
		lblPok1TotAtk.setText("00");
		lblPok1TotAtk.setBounds(320, 98, 28, 14);

		Label lblPok1TotDef = new Label(cmpPokemon1, SWT.NONE);
		lblPok1TotDef.setText("00");
		lblPok1TotDef.setBounds(320, 125, 28, 14);

		Label lblPok1TotSpAtk = new Label(cmpPokemon1, SWT.NONE);
		lblPok1TotSpAtk.setText("00");
		lblPok1TotSpAtk.setBounds(320, 153, 28, 14);

		Label lblPok1TotSpDef = new Label(cmpPokemon1, SWT.NONE);
		lblPok1TotSpDef.setText("00");
		lblPok1TotSpDef.setBounds(320, 181, 28, 14);

		Label lblPok1TotSpeed = new Label(cmpPokemon1, SWT.NONE);
		lblPok1TotSpeed.setText("00");
		lblPok1TotSpeed.setBounds(320, 209, 28, 14);
	}
	
	public void createPokemon2Group() {
		TabItem tabPokemon2 = new TabItem(pokCalcFolder, SWT.NONE);
		tabPokemon2.setText("Pokemon 2");
		
		Composite cmpPokemon2 = new Composite(pokCalcFolder, SWT.NONE);
		tabPokemon2.setControl(cmpPokemon2);
		
		Label lblPok2Name = new Label(cmpPokemon2, SWT.NONE);
		lblPok2Name.setText("Pokemon");
		lblPok2Name.setBounds(10, 10, 60, 14);
		
		Combo cmbPok2Name = new Combo(cmpPokemon2, SWT.NONE);
		cmbPok2Name.setBounds(76, 6, 139, 25);
		
		Label lblPok2Level = new Label(cmpPokemon2, SWT.NONE);
		lblPok2Level.setText("Level");
		lblPok2Level.setBounds(221, 10, 38, 14);
		
		txtPok2Level = new Text(cmpPokemon2, SWT.BORDER);
		txtPok2Level.setText("100");
		txtPok2Level.setBounds(255, 7, 30, 19);
		
		Label lblPok2Type = new Label(cmpPokemon2, SWT.NONE);
		lblPok2Type.setText("Type");
		lblPok2Type.setBounds(10, 30, 60, 18);
		
		Combo cmbPok2Type1 = new Combo(cmpPokemon2, SWT.NONE);
		cmbPok2Type1.setBounds(76, 26, 75, 25);
		
		Combo cmbPok2Type2 = new Combo(cmpPokemon2, SWT.NONE);
		cmbPok2Type2.setBounds(157, 26, 75, 25);
		
		Label lblPok2CurrHP = new Label(cmpPokemon2, SWT.NONE);
		lblPok2CurrHP.setText("Curr HP");
		lblPok2CurrHP.setBounds(238, 30, 60, 14);
		
		txtPok2CurrHPNum = new Text(cmpPokemon2, SWT.BORDER);
		txtPok2CurrHPNum.setText("000");
		txtPok2CurrHPNum.setBounds(292, 27, 28, 19);
		
		Label lblPok2CurrHPMax = new Label(cmpPokemon2, SWT.NONE);
		lblPok2CurrHPMax.setText("/000");
		lblPok2CurrHPMax.setBounds(320, 30, 28, 14);
		
		Label lblPok2PerBounds = new Label(cmpPokemon2, SWT.NONE);
		lblPok2PerBounds.setText("(           %)");
		lblPok2PerBounds.setBounds(354, 30, 60, 14);
		
		txtPok2CurrHPPer = new Text(cmpPokemon2, SWT.BORDER);
		txtPok2CurrHPPer.setText("100");
		txtPok2CurrHPPer.setBounds(364, 27, 30, 19);
		
		Label lblPok2HP = new Label(cmpPokemon2, SWT.NONE);
		lblPok2HP.setText("HP");
		lblPok2HP.setBounds(10, 70, 60, 14);
		
		Label lblPok2Atk = new Label(cmpPokemon2, SWT.NONE);
		lblPok2Atk.setText("Attack");
		lblPok2Atk.setBounds(10, 98, 60, 14);
		
		Label lblPok2Def = new Label(cmpPokemon2, SWT.NONE);
		lblPok2Def.setText("Defense");
		lblPok2Def.setBounds(10, 125, 60, 14);
		
		Label lblPok2SpAtk = new Label(cmpPokemon2, SWT.NONE);
		lblPok2SpAtk.setText("Sp. Atk");
		lblPok2SpAtk.setBounds(10, 153, 60, 14);

		Label lblPok2SpDef = new Label(cmpPokemon2, SWT.NONE);
		lblPok2SpDef.setText("Sp. Def");
		lblPok2SpDef.setBounds(10, 181, 60, 14);

		Label lblPok2Speed = new Label(cmpPokemon2, SWT.NONE);
		lblPok2Speed.setText("Speed");
		lblPok2Speed.setBounds(10, 209, 60, 14);

		Label lblPok2Base = new Label(cmpPokemon2, SWT.NONE);
		lblPok2Base.setText("Base");
		lblPok2Base.setBounds(76, 50, 38, 14);

		Label lblPok2BaseHP = new Label(cmpPokemon2, SWT.NONE);
		lblPok2BaseHP.setText("00");
		lblPok2BaseHP.setBounds(76, 70, 28, 14);

		Label lblPok2IVs = new Label(cmpPokemon2, SWT.NONE);
		lblPok2IVs.setText("IV's");
		lblPok2IVs.setBounds(117, 50, 28, 14);

		Combo cmbPok2IVHP = new Combo(cmpPokemon2, SWT.READ_ONLY);
		enterIVs(cmbPok2IVHP);
		cmbPok2IVHP.setBounds(117, 67, 48, 22);

		Combo cmbPok2IVAtk = new Combo(cmpPokemon2, SWT.READ_ONLY);
		enterIVs(cmbPok2IVAtk);
		cmbPok2IVAtk.setBounds(117, 94, 48, 22);

		Combo cmbPok2IVDef = new Combo(cmpPokemon2, SWT.READ_ONLY);
		enterIVs(cmbPok2IVDef);
		cmbPok2IVDef.setBounds(117, 121, 48, 22);

		Combo cmbPok2IVSpAtk = new Combo(cmpPokemon2, SWT.READ_ONLY);
		enterIVs(cmbPok2IVSpAtk);
		cmbPok2IVSpAtk.setBounds(117, 149, 48, 22);

		Combo cmbPok2IVSpDef = new Combo(cmpPokemon2, SWT.READ_ONLY);
		enterIVs(cmbPok2IVSpDef);
		cmbPok2IVSpDef.setBounds(117, 177, 48, 22);

		Combo cmbPok2IVSpeed = new Combo(cmpPokemon2, SWT.READ_ONLY);
		enterIVs(cmbPok2IVSpeed);
		cmbPok2IVSpeed.setBounds(117, 205, 48, 22);


		Label lblPok2BaseAtk = new Label(cmpPokemon2, SWT.NONE);
		lblPok2BaseAtk.setText("00");
		lblPok2BaseAtk.setBounds(76, 98, 28, 14);

		Label lblPok2BaseDef = new Label(cmpPokemon2, SWT.NONE);
		lblPok2BaseDef.setText("00");
		lblPok2BaseDef.setBounds(76, 125, 28, 14);

		Label lblPok2BaseSpAtk = new Label(cmpPokemon2, SWT.NONE);
		lblPok2BaseSpAtk.setText("00");
		lblPok2BaseSpAtk.setBounds(76, 153, 28, 14);

		Label lblPok2BaseSpDef = new Label(cmpPokemon2, SWT.NONE);
		lblPok2BaseSpDef.setText("00");
		lblPok2BaseSpDef.setBounds(76, 181, 28, 14);

		Label lblPok2BaseSpeed = new Label(cmpPokemon2, SWT.NONE);
		lblPok2BaseSpeed.setText("00");
		lblPok2BaseSpeed.setBounds(76, 209, 28, 14);

		Label lblPok2EVs = new Label(cmpPokemon2, SWT.NONE);
		lblPok2EVs.setText("EV's");
		lblPok2EVs.setBounds(167, 50, 60, 14);

		Slider sldrPok2HP = new Slider(cmpPokemon2, SWT.NONE);
		sldrPok2HP.setIncrement(4);
		sldrPok2HP.setMaximum(252);
		sldrPok2HP.setBounds(171, 69, 105, 15);

		Slider sldrPok2Atk = new Slider(cmpPokemon2, SWT.NONE);
		sldrPok2Atk.setIncrement(4);
		sldrPok2Atk.setMaximum(252);
		sldrPok2Atk.setBounds(171, 97, 105, 15);

		Slider sldrPok2Def = new Slider(cmpPokemon2, SWT.NONE);
		sldrPok2Def.setIncrement(4);
		sldrPok2Def.setMaximum(252);
		sldrPok2Def.setBounds(171, 124, 105, 15);

		Slider sldrPok2SpAtk = new Slider(cmpPokemon2, SWT.NONE);
		sldrPok2SpAtk.setIncrement(4);
		sldrPok2SpAtk.setMaximum(252);
		sldrPok2SpAtk.setBounds(171, 152, 105, 15);

		Slider sldrPok2SpDef = new Slider(cmpPokemon2, SWT.NONE);
		sldrPok2SpDef.setIncrement(4);
		sldrPok2SpDef.setMaximum(252);
		sldrPok2SpDef.setBounds(171, 180, 105, 15);

		Slider sldrPok2Speed = new Slider(cmpPokemon2, SWT.NONE);
		sldrPok2Speed.setIncrement(4);
		sldrPok2Speed.setMaximum(252);
		sldrPok2Speed.setBounds(171, 208, 105, 15);

		txtPok2HP = new Text(cmpPokemon2, SWT.BORDER);
		txtPok2HP.setText("000");
		txtPok2HP.setBounds(281, 67, 30, 19);

		txtPok2Atk = new Text(cmpPokemon2, SWT.BORDER);
		txtPok2Atk.setText("000");
		txtPok2Atk.setBounds(282, 95, 30, 19);

		txtPok2Def = new Text(cmpPokemon2, SWT.BORDER);
		txtPok2Def.setText("000");
		txtPok2Def.setBounds(282, 122, 28, 19);

		txtPok2SpAtk = new Text(cmpPokemon2, SWT.BORDER);
		txtPok2SpAtk.setText("000");
		txtPok2SpAtk.setBounds(282, 150, 30, 19);

		txtPok2SpDef = new Text(cmpPokemon2, SWT.BORDER);
		txtPok2SpDef.setText("000");
		txtPok2SpDef.setBounds(282, 178, 30, 19);

		txtPok2Speed = new Text(cmpPokemon2, SWT.BORDER);
		txtPok2Speed.setText("000");
		txtPok2Speed.setBounds(282, 206, 30, 19);

		Combo cmbPok2ModHP = new Combo(cmpPokemon2, SWT.READ_ONLY);
		enterMods(cmbPok2ModHP);
		cmbPok2ModHP.setBounds(366, 67, 48, 25);

		Combo cmbPok2ModAtk = new Combo(cmpPokemon2, SWT.READ_ONLY);
		enterMods(cmbPok2ModAtk);
		cmbPok2ModAtk.setBounds(366, 94, 48, 25);

		Combo cmbPok2ModDef = new Combo(cmpPokemon2, SWT.READ_ONLY);
		enterMods(cmbPok2ModDef);
		cmbPok2ModDef.setBounds(366, 121, 48, 25);

		Combo cmbPok2ModSpAtk = new Combo(cmpPokemon2, SWT.READ_ONLY);
		enterMods(cmbPok2ModSpAtk);
		cmbPok2ModSpAtk.setBounds(366, 149, 48, 25);

		Combo cmbPok2ModSpDef = new Combo(cmpPokemon2, SWT.READ_ONLY);
		enterMods(cmbPok2ModSpDef);
		cmbPok2ModSpDef.setBounds(366, 177, 48, 25);

		Combo cmbPok2ModSpeed = new Combo(cmpPokemon2, SWT.READ_ONLY);
		enterMods(cmbPok2ModSpeed);
		cmbPok2ModSpeed.setBounds(366, 205, 48, 25);

		Label lblPok2Mods = new Label(cmpPokemon2, SWT.NONE);
		lblPok2Mods.setText("Mods");
		lblPok2Mods.setBounds(360, 50, 33, 14);

		Label lblPok2Nature = new Label(cmpPokemon2, SWT.NONE);
		lblPok2Nature.setText("Nature");
		lblPok2Nature.setBounds(10, 237, 60, 14);

		Label lblPok2Ability = new Label(cmpPokemon2, SWT.NONE);
		lblPok2Ability.setText("Ability");
		lblPok2Ability.setBounds(10, 265, 60, 14);

		Label lblPok2Item = new Label(cmpPokemon2, SWT.NONE);
		lblPok2Item.setText("Item");
		lblPok2Item.setBounds(10, 293, 60, 14);

		Combo cmbPok2Nature = new Combo(cmpPokemon2, SWT.NONE);
		cmbPok2Nature.setBounds(76, 233, 124, 25);

		Combo cmbPok2Ability = new Combo(cmpPokemon2, SWT.NONE);
		cmbPok2Ability.setBounds(76, 261, 124, 22);

		Combo cmbPok2Item = new Combo(cmpPokemon2, SWT.NONE);
		cmbPok2Item.setBounds(76, 289, 124, 25);

		Combo cmbPok2Status = new Combo(cmpPokemon2, SWT.READ_ONLY);
		cmbPok2Status.setItems(new String[] {"Healthy", "Poisoned", "Badly Poisoned", "Burned", "Paralyzed", "Asleep", "Frozen"});
		cmbPok2Status.setBounds(76, 317, 124, 25);
		cmbPok2Status.select(0);

		Label lblPok2Status = new Label(cmpPokemon2, SWT.NONE);
		lblPok2Status.setText("Status");
		lblPok2Status.setBounds(10, 321, 60, 14);

		Combo cmbPok2Move1 = new Combo(cmpPokemon2, SWT.NONE);
		cmbPok2Move1.setBounds(206, 233, 160, 22);

		Combo cmbPok2Move2 = new Combo(cmpPokemon2, SWT.NONE);
		cmbPok2Move2.setBounds(206, 261, 160, 22);

		Combo cmbPok2Move3 = new Combo(cmpPokemon2, SWT.NONE);
		cmbPok2Move3.setBounds(206, 289, 160, 22);

		Combo cmbPok2Move4 = new Combo(cmpPokemon2, SWT.NONE);
		cmbPok2Move4.setBounds(206, 317, 160, 22);

		Button btnPok2Crit1 = new Button(cmpPokemon2, SWT.CHECK);
		btnPok2Crit1.setText("Crit");
		btnPok2Crit1.setBounds(372, 234, 53, 18);

		Button btnPok2Crit2 = new Button(cmpPokemon2, SWT.CHECK);
		btnPok2Crit2.setText("Crit");
		btnPok2Crit2.setBounds(372, 262, 53, 18);

		Button btnPok2Crit3 = new Button(cmpPokemon2, SWT.CHECK);
		btnPok2Crit3.setText("Crit");
		btnPok2Crit3.setBounds(372, 290, 53, 18);

		Button btnPok2Crit4 = new Button(cmpPokemon2, SWT.CHECK);
		btnPok2Crit4.setText("Crit");
		btnPok2Crit4.setBounds(372, 317, 53, 18);

		Label lblPok2Total = new Label(cmpPokemon2, SWT.NONE);
		lblPok2Total.setText("Total");
		lblPok2Total.setBounds(320, 50, 60, 14);

		Label lblPok2TotHP = new Label(cmpPokemon2, SWT.NONE);
		lblPok2TotHP.setText("00");
		lblPok2TotHP.setBounds(332, 70, 28, 14);

		Label lblPok2TotAtk = new Label(cmpPokemon2, SWT.NONE);
		lblPok2TotAtk.setText("00");
		lblPok2TotAtk.setBounds(332, 98, 28, 14);

		Label lblPok2TotDef = new Label(cmpPokemon2, SWT.NONE);
		lblPok2TotDef.setText("00");
		lblPok2TotDef.setBounds(332, 125, 28, 14);

		Label lblPok2TotSpAtk = new Label(cmpPokemon2, SWT.NONE);
		lblPok2TotSpAtk.setText("00");
		lblPok2TotSpAtk.setBounds(332, 153, 28, 14);

		Label lblPok2TotSpDef = new Label(cmpPokemon2, SWT.NONE);
		lblPok2TotSpDef.setText("00");
		lblPok2TotSpDef.setBounds(332, 181, 28, 14);

		Label lblPok2TotSpeed = new Label(cmpPokemon2, SWT.NONE);
		lblPok2TotSpeed.setText("00");
		lblPok2TotSpeed.setBounds(332, 209, 28, 14);
	}
	
	public void createFieldGroup() {
		
		TabItem tabField = new TabItem(pokCalcFolder, SWT.NONE);
		tabField.setText("Field");
		
		Composite cmpField = new Composite(pokCalcFolder, SWT.NONE);
		tabField.setControl(cmpField);
		
		Composite composite = new Composite(cmpField, SWT.NONE);
		composite.setBounds(10, 10, 89, 36);
		
		Button btnSingles = new Button(composite, SWT.RADIO);
		btnSingles.setSelection(true);
		btnSingles.setBounds(10, 0, 66, 18);
		btnSingles.setText("Singles");
		
		Button btnDoubles = new Button(composite, SWT.RADIO);
		btnDoubles.setBounds(10, 18, 79, 18);
		btnDoubles.setText("Doubles");
		
		Group grpTerrain = new Group(cmpField, SWT.NONE);
		grpTerrain.setText("Terrain");
		grpTerrain.setBounds(105, 10, 290, 36);
		
		Button btnNoTerrain = new Button(grpTerrain, SWT.RADIO);
		btnNoTerrain.setSelection(true);
		btnNoTerrain.setBounds(10, 0, 56, 18);
		btnNoTerrain.setText("None");
		
		Button btnElectric = new Button(grpTerrain, SWT.RADIO);
		btnElectric.setBounds(66, 0, 71, 18);
		btnElectric.setText("Electric");
		
		Button btnGrassy = new Button(grpTerrain, SWT.RADIO);
		btnGrassy.setBounds(138, 0, 66, 18);
		btnGrassy.setText("Grassy");
		
		Button btnMisty = new Button(grpTerrain, SWT.RADIO);
		btnMisty.setBounds(210, 0, 56, 18);
		btnMisty.setText("Misty");
		
		Group grpWeather = new Group(cmpField, SWT.NONE);
		grpWeather.setText("Weather");
		grpWeather.setBounds(10, 52, 385, 64);
		
		Button btnNoWeather = new Button(grpWeather, SWT.RADIO);
		btnNoWeather.setSelection(true);
		btnNoWeather.setBounds(10, 0, 61, 18);
		btnNoWeather.setText("None");
		
		Button btnSun = new Button(grpWeather, SWT.RADIO);
		btnSun.setBounds(66, 0, 50, 18);
		btnSun.setText("Sun");
		
		Button btnRain = new Button(grpWeather, SWT.RADIO);
		btnRain.setBounds(115, 0, 50, 18);
		btnRain.setText("Rain");
		
		Button btnSand = new Button(grpWeather, SWT.RADIO);
		btnSand.setBounds(171, 0, 56, 18);
		btnSand.setText("Sand");
		
		Button btnHail = new Button(grpWeather, SWT.RADIO);
		btnHail.setBounds(227, 0, 50, 18);
		btnHail.setText("Hail");
		
		Button btnStrongSun = new Button(grpWeather, SWT.RADIO);
		btnStrongSun.setBounds(10, 24, 119, 18);
		btnStrongSun.setText("Harsh Sunshine");
		
		Button btnHeavyRain = new Button(grpWeather, SWT.RADIO);
		btnHeavyRain.setBounds(135, 24, 92, 18);
		btnHeavyRain.setText("Heavy Rain");
		
		Button btnStrongWinds = new Button(grpWeather, SWT.RADIO);
		btnStrongWinds.setBounds(227, 24, 99, 18);
		btnStrongWinds.setText("Strong Winds");
		
		Combo cmbPok1Spikes = new Combo(cmpField, SWT.READ_ONLY);
		cmbPok1Spikes.setItems(new String[] {"0", "1", "2", "3"});
		cmbPok1Spikes.setBounds(10, 175, 46, 22);
		cmbPok1Spikes.setText("0");
		
		Label lblPok1Spikes = new Label(cmpField, SWT.NONE);
		lblPok1Spikes.setBounds(62, 178, 46, 19);
		lblPok1Spikes.setText("Spikes");
		
		Combo cmbPok2Spikes = new Combo(cmpField, SWT.READ_ONLY);
		cmbPok2Spikes.setItems(new String[] {"0", "1", "2", "3"});
		cmbPok2Spikes.setBounds(300, 175, 43, 22);
		cmbPok2Spikes.setText("0");
		
		Label lblPok2Spikes = new Label(cmpField, SWT.NONE);
		lblPok2Spikes.setText("Spikes");
		lblPok2Spikes.setBounds(349, 179, 46, 18);
		
		Button btnPok1StealthRock = new Button(cmpField, SWT.CHECK);
		btnPok1StealthRock.setBounds(10, 155, 110, 18);
		btnPok1StealthRock.setText("Stealth Rock");
		
		Button btnPok2StealthRock = new Button(cmpField, SWT.CHECK);
		btnPok2StealthRock.setText("Stealth Rock");
		btnPok2StealthRock.setBounds(300, 155, 110, 18);
		
		Button btnPok1Reflect = new Button(cmpField, SWT.CHECK);
		btnPok1Reflect.setBounds(10, 199, 67, 18);
		btnPok1Reflect.setText("Reflect");
		
		Button btnPok1LightScreen = new Button(cmpField, SWT.CHECK);
		btnPok1LightScreen.setBounds(83, 198, 110, 18);
		btnPok1LightScreen.setText("Light Screen");
		
		Button btnPok1Forsight = new Button(cmpField, SWT.CHECK);
		btnPok1Forsight.setBounds(10, 215, 71, 18);
		btnPok1Forsight.setText("Forsight");
		
		Button btnPok1HelpingHand = new Button(cmpField, SWT.CHECK);
		btnPok1HelpingHand.setBounds(83, 215, 110, 18);
		btnPok1HelpingHand.setText("Helping Hand");
		
		Button btnPok2Reflect = new Button(cmpField, SWT.CHECK);
		btnPok2Reflect.setText("Reflect");
		btnPok2Reflect.setBounds(223, 199, 71, 18);
		
		Button btnPok2LightScreen = new Button(cmpField, SWT.CHECK);
		btnPok2LightScreen.setText("Light Screen");
		btnPok2LightScreen.setBounds(300, 199, 105, 18);
		
		Button btnPok2Forsight = new Button(cmpField, SWT.CHECK);
		btnPok2Forsight.setText("Forsight");
		btnPok2Forsight.setBounds(223, 215, 71, 18);
		
		Button btnPok2HelpingHand = new Button(cmpField, SWT.CHECK);
		btnPok2HelpingHand.setText("Helping Hand");
		btnPok2HelpingHand.setBounds(300, 215, 105, 18);
		
		Button btnGravity = new Button(cmpField, SWT.CHECK);
		btnGravity.setBounds(168, 114, 66, 18);
		btnGravity.setText("Gravity");
		
		Label label_35 = new Label(cmpField, SWT.SEPARATOR | SWT.VERTICAL);
		label_35.setBounds(199, 155, 2, 78);
		
		Label label_40 = new Label(cmpField, SWT.SEPARATOR | SWT.HORIZONTAL);
		label_40.setBounds(10, 138, 385, 2);
	}
	
	public void createDamageGroup() {
		TabItem tabBattle = new TabItem(pokCalcFolder, SWT.NONE);
		tabBattle.setText("Battle");
		
		Composite cmpDamage = new Composite(pokCalcFolder, SWT.NONE);
		tabBattle.setControl(cmpDamage);
		
		Label lblPok1Move1 = new Label(cmpDamage, SWT.NONE);
		lblPok1Move1.setBounds(243, 10, 109, 14);
		lblPok1Move1.setText("Pokemon1 Move 1");
		
		Label lblPok1Move2 = new Label(cmpDamage, SWT.NONE);
		lblPok1Move2.setBounds(243, 30, 109, 14);
		lblPok1Move2.setText("Pokemon1 Move 2");
		
		Label lblPok1Move3 = new Label(cmpDamage, SWT.NONE);
		lblPok1Move3.setBounds(243, 50, 109, 14);
		lblPok1Move3.setText("Pokemon1 Move 3");
		
		Label lblPok1Move4 = new Label(cmpDamage, SWT.NONE);
		lblPok1Move4.setBounds(243, 70, 109, 14);
		lblPok1Move4.setText("Pokemon1 Move 4");
		
		Label lblPok1MinMax1 = new Label(cmpDamage, SWT.NONE);
		lblPok1MinMax1.setBounds(358, 10, 77, 14);
		lblPok1MinMax1.setText("Min%-Max%");
		
		Label lblPok1MinMax2 = new Label(cmpDamage, SWT.NONE);
		lblPok1MinMax2.setText("Min%-Max%");
		lblPok1MinMax2.setBounds(358, 30, 77, 14);
		
		Label lblPok1MinMax3 = new Label(cmpDamage, SWT.NONE);
		lblPok1MinMax3.setText("Min%-Max%");
		lblPok1MinMax3.setBounds(358, 50, 77, 14);
		
		Label lblPok1MinMax4 = new Label(cmpDamage, SWT.NONE);
		lblPok1MinMax4.setText("Min%-Max%");
		lblPok1MinMax4.setBounds(358, 70, 77, 14);
		
		Label lblPok2Move1 = new Label(cmpDamage, SWT.NONE);
		lblPok2Move1.setText("Pokemon2 Move 1");
		lblPok2Move1.setBounds(10, 269, 109, 14);
		
		Label lblPok2Move2 = new Label(cmpDamage, SWT.NONE);
		lblPok2Move2.setText("Pokemon2 Move 2");
		lblPok2Move2.setBounds(10, 289, 109, 14);
		
		Label lblPok2Move3 = new Label(cmpDamage, SWT.NONE);
		lblPok2Move3.setText("Pokemon2 Move 3");
		lblPok2Move3.setBounds(10, 309, 109, 14);
		
		Label lblPok2Move4 = new Label(cmpDamage, SWT.NONE);
		lblPok2Move4.setText("Pokemon2 Move 4");
		lblPok2Move4.setBounds(10, 329, 109, 14);
		
		Label lblPok2MinMax1 = new Label(cmpDamage, SWT.NONE);
		lblPok2MinMax1.setText("Min%-Max%");
		lblPok2MinMax1.setBounds(125, 269, 77, 14);
		
		Label lblPok2MinMax2 = new Label(cmpDamage, SWT.NONE);
		lblPok2MinMax2.setText("Min%-Max%");
		lblPok2MinMax2.setBounds(125, 289, 77, 14);
		
		Label lblPok2MinMax3 = new Label(cmpDamage, SWT.NONE);
		lblPok2MinMax3.setText("Min%-Max%");
		lblPok2MinMax3.setBounds(125, 309, 77, 14);
		
		Label lblPok2MinMax4 = new Label(cmpDamage, SWT.NONE);
		lblPok2MinMax4.setText("Min%-Max%");
		lblPok2MinMax4.setBounds(125, 329, 77, 14);
	}
	
	public void enterMods(Combo fillCombo) {
		fillCombo.setItems(new String[] {"+6", "+5", "+4", "+3", "+2", "+1", "0", "-1", "-2", "-3", "-4", "-5", "-6"});
		fillCombo.select(6);
	}
	
	public void enterIVs(Combo fillCombo) {
		fillCombo.setItems(new String[] {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"});
		fillCombo.select(31);
	}
}

