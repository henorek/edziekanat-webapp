package net.elenx;

import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.VerticalLayout;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;

public class Content {

    @Bean
    HorizontalLayout content(@Qualifier("sidebar") VerticalLayout sidebar, @Qualifier("mainView") VerticalLayout mainView) {
        HorizontalLayout content = new HorizontalLayout();
        content.setSizeFull();
        content.addComponent(sidebar);
        content.addComponent(mainView);
        return content;
    }
}
