package com.yanpgabriel;

import io.quarkus.runtime.ShutdownEvent;
import io.quarkus.runtime.StartupEvent;
import io.quarkus.runtime.configuration.ProfileManager;
import org.h2.tools.Server;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;
import java.sql.SQLException;

@ApplicationScoped
public class TaskApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger("TaskApplication");

    Server serverH2;

    void onStart(@Observes StartupEvent event) throws SQLException {
        LOGGER.info("A aplicação iniciou usando o profile: {}", ProfileManager.getActiveProfile());

        LOGGER.info("Inicializando H2...");
        serverH2 = Server.createTcpServer("-tcpPort", "9092", "-tcpAllowOthers").start();
        LOGGER.info("===================");
    }
    
    void onStop(@Observes ShutdownEvent event) {
        serverH2.stop();
    }

}
