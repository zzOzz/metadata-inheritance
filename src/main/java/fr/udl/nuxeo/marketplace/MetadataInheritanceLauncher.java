package fr.udl.nuxeo.marketplace;

import org.nuxeo.ecm.core.api.DocumentModel;

public class MetadataInheritanceLauncher extends MetadataInheritance {

	public MetadataInheritanceLauncher() {
		super.initTestMetadata();
	}
	
	public void start(DocumentModel doc) {
		super.applyMetadataOnChildren(doc);
	}

}
