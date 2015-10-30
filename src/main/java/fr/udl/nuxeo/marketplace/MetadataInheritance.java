package fr.udl.nuxeo.marketplace;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.nuxeo.ecm.core.api.ClientException;
import org.nuxeo.ecm.core.api.DocumentModel;
import org.nuxeo.ecm.core.api.DocumentModelList;
import org.nuxeo.ecm.core.event.Event;
import org.nuxeo.ecm.core.event.EventContext;
import org.nuxeo.ecm.core.event.EventListener;
import org.nuxeo.ecm.core.event.impl.DocumentEventContext;
import org.nuxeo.ecm.core.schema.DocumentType;


public class MetadataInheritance {

	private ArrayList<String> metadataToInherit = new ArrayList();
	
	public void initTestMetadata() {
		metadataToInherit.add("Description");
	}
	
	public void applyMetadataOnChildren(DocumentModel doc) {
		
		String[] docSchemas = doc.getSchemas();
		
		
	}
}
