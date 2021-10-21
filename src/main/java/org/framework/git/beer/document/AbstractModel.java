package org.framework.git.beer.document;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public abstract class AbstractModel extends AuditMetadata {
}
