package com.company.onboarding.view.layout.vbox;


import com.company.onboarding.view.main.MainView;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.StandardView;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "VboxView", layout = MainView.class)
@ViewController("VboxView")
@ViewDescriptor("vbox-view.xml")
public class VboxView extends StandardView {
}