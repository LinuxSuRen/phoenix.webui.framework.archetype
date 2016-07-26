/**
 * http://surenpi.com
 */
package ${package};

import ${package}.page.SuRenPiHomePage;
import org.suren.autotest.web.framework.settings.SettingUtil;

/**
 * @author suren
 * @date Jul 23, 2016 4:48:39 PM
 */
public class Test
{

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception
	{
		SettingUtil util = new SettingUtil("${package}.page"); //这里的参数是Page类所在的包（package）
		util.readFromClassPath("surenpi_page.xml"); //从resources目录下读取配置文件
		util.initData();
		
		SuRenPiHomePage homePage = util.getPage(SuRenPiHomePage.class);
		homePage.open(); //打开浏览器地址
		homePage.getSearchText().fillValue().performEnter();

		homePage.getCloseBut().click(); //关闭右下角公告
		
		Thread.sleep(9000);
		
		homePage.close();
	}

}
