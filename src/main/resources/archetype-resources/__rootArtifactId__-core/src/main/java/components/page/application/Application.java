package ${package}.components.page.application;

import com.citytechinc.aem.bedrock.api.page.PageDecorator;
import com.citytechinc.aem.bedrock.core.components.AbstractComponent;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import javax.inject.Inject;

@Model(adaptables = Resource.class)
public class Application extends AbstractComponent {

    public static final String RESOURCE_TYPE = "${rootArtifactId}/components/page/application";

    @Inject
    private PageDecorator currentPage;

    public String getApplicationRootPath() {
        return currentPage.getName();
    }

}