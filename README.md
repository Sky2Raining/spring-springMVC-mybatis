<!--配置视图解析器-->
    <!--视图解析器1.html-->
    <!--<bean id="freemarkerConfig" class="org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer">-->
        <!--<property name="templateLoaderPath" value="/WEB-INF/html/"/>-->
    <!--</bean>-->
    <!--<bean id="htmlViewResolver" class="org.springframework.web.servlet.view.freemarker.FreeMarkerViewResolver">-->
        <!--<property name="contentType" value="text/html;charset=UTF-8"/>-->
        <!--<property name="suffix" value=".html/"/>&lt;!&ndash;设置html文件后缀&ndash;&gt;-->
        <!--<property name="order" value="0"/>&lt;!&ndash; 配置优先等级，越小优先级越高 &ndash;&gt;-->
    <!--</bean>-->
    <!--视图解析器2.jsp-->
    <!--<bean id="jspViewResolver" class="org.springframework.web.servlet.view.InternalResourceViewResolver">-->
        <!--<property name="viewClass" value="org.springframework.web.servlet.view.JstlView"/>-->
        <!--&lt;!&ndash;<property name="viewClass" value="org.springframework.web.servlet.view.InternalResourceView"/>&ndash;&gt;-->
        <!--<property name="contentType" value="text/html;charset=UTF-8"/>-->
        <!--<property name="prefix" value="/WEB-INF/jsp/"/>&lt;!&ndash;设置JSP文件前缀&ndash;&gt;-->
        <!--<property name="suffix" value=".jsp"/>&lt;!&ndash;设置JSP文件后缀&ndash;&gt;-->
        <!--<property name="order" value="0" />-->
    <!--</bean>-->