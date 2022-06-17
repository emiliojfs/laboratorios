package com.systemnecs;


import org.graalvm.compiler.phases.common.NodeCounterPhase;

import javax.ws.rs.core.Application;

public class MainApp extends Application {
        public static void main(String[] args){
            launch(args);
        }

        @Override
        public void start(NodeCounterPhase.Stage primaryStage){

        }


}
