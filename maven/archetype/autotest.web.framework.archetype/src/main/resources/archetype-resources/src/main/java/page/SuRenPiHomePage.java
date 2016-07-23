/**
 * http://surenpi.com
 */
package ${package}.page;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
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

	public Text getSearchText()
	{
		return searchText;
	}

	public void setSearchText(Text searchText)
	{
		this.searchText = searchText;
	}
}
