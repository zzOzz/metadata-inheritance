/**
 * 
 */

package fr.udl.nuxeo.marketplace;

import org.nuxeo.ecm.core.api.ClientException;
import org.nuxeo.ecm.core.api.DocumentModel;
import org.nuxeo.ecm.core.event.Event;
import org.nuxeo.ecm.core.event.EventContext;
import org.nuxeo.ecm.core.event.EventListener;
import org.nuxeo.ecm.core.event.impl.DocumentEventContext;


/**
 * @author alexandrenguyen
 */
public class CreateDocumentListener implements EventListener {

	private MetadataInheritanceLauncher launcher = new MetadataInheritanceLauncher();

    public void handleEvent(Event event) throws ClientException {

        EventContext ctx = event.getContext();
        if (!(ctx instanceof DocumentEventContext)) {
            return;
        }
        DocumentModel doc = ((DocumentEventContext) ctx).getSourceDocument();
        if (doc == null) {
            return;
        }
        
    	launcher.start(doc);
    }

}
