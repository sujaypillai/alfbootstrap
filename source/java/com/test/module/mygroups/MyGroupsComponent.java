package com.test.module.mygroups;

import org.alfresco.repo.module.ImporterModuleComponent;

public class MyGroupsComponent extends ImporterModuleComponent {

	@Override
	protected void executeInternal() throws Throwable {
		System.out.println(">>> MyGroupsComponent has been executed");
	}

}
