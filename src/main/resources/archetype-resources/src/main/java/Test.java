/**
 * http://surenpi.com
 */
package ${package};

import ${package}.page.SuRenPiHomePage;
import org.suren.autotest.web.framework.settings.SettingUtil;

/**
 * 测试示例，该测试代码和runner_suite.xml的效果是一样的
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
		SettingUtil util = new SettingUtil(); //这里的参数是Page类所在的包（package
		try
		{
			util.readFromClassPath("surenpi_page.xml"); //从resources目录下读取配置文件
			util.initData(); //从数据源中初始化数据
			
			SuRenPiHomePage homePage = util.getPage(SuRenPiHomePage.class);
			homePage.open(); //打开浏览器地址
			homePage.getSearchText().fillValue().performEnter(); //输入搜索关键字并按回车确认

			homePage.getCloseBut().click(); //关闭右下角公告
			
			homePage.getChargeText().fillValue(); //填入淘宝手机充值号码
			
			homePage.getCheckBoxGroup().selectByText(); //设置要充值的金额
			
			homePage.getChargeBut().click(); //点击充值确认按钮
			
			Thread.sleep(9000); //这里为了能让用户更方便地看到自动化测试效果
		}
		finally
		{
			util.close(); //在程序最终结束后应该调用close方法来关闭浏览器引擎，不然可能发生资源泄漏的问题
		}
	}

}
