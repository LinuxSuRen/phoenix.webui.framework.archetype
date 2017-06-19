package ${package}.module;

import org.suren.autotest.web.framework.annotation.AutoExpect;
import org.suren.autotest.web.framework.annotation.AutoModule;

/**
 * @author suren
 */
@AutoModule(name = "项目管理模块")
public class ProjectModule
{
    @AutoExpect(accept = NullPointerException.class)
    public void addProject()
    {
        String str = null ;
        str.length();
    }

    public void listProject()
    {
    }
}
