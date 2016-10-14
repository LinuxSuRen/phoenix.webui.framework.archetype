/**
 * http://surenpi.com
 */
package ${package}.page;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.suren.autotest.web.framework.core.ui.Button;
import org.suren.autotest.web.framework.core.ui.CheckBoxGroup;
import org.suren.autotest.web.framework.core.ui.Text;
import org.suren.autotest.web.framework.page.Page;

/**
 * 类上必须添加注解@Componentn</br>
 * 属性上必须添加注解@Autowired以及对应的getter和setter方法
 * @author suren
 * @date Jul 23, 2016 4:41:16 PM
 */
@Component
public class SuRenPiHomePage extends Page
{
	/** 首页的搜索文本框 */
	@Autowired
	private Text searchText;
	@Autowired
	private Button closeBut;
	@Autowired
	private CheckBoxGroup checkBoxGroup;
	@Autowired
	private Text chargeText;
	@Autowired
	private Button chargeBut;
	@Autowired
	private Button devBut;
	@Autowired
	private Button javaBut;

	public Text getSearchText()
	{
		return searchText;
	}

	public void setSearchText(Text searchText)
	{
		this.searchText = searchText;
	}

	public Button getCloseBut() {
		return closeBut;
	}

	public void setCloseBut(Button closeBut) {
		this.closeBut = closeBut;
	}

	public CheckBoxGroup getCheckBoxGroup() {
		return checkBoxGroup;
	}

	public void setCheckBoxGroup(CheckBoxGroup checkBoxGroup) {
		this.checkBoxGroup = checkBoxGroup;
	}

	public Button getChargeBut() {
		return chargeBut;
	}

	public void setChargeBut(Button chargeBut) {
		this.chargeBut = chargeBut;
	}

	public Text getChargeText() {
		return chargeText;
	}

	public void setChargeText(Text chargeText) {
		this.chargeText = chargeText;
	}

	public Button getDevBut() {
		return devBut;
	}

	public void setDevBut(Button devBut) {
		this.devBut = devBut;
	}

	public Button getJavaBut() {
		return javaBut;
	}

	public void setJavaBut(Button javaBut) {
		this.javaBut = javaBut;
	}
}