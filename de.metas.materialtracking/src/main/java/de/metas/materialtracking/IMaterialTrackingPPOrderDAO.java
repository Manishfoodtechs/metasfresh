package de.metas.materialtracking;

import org.adempiere.util.ISingletonService;

import de.metas.materialtracking.model.I_PP_Order;

/*
 * #%L
 * de.metas.materialtracking
 * %%
 * Copyright (C) 2015 metas GmbH
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 2 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/gpl-2.0.html>.
 * #L%
 */

public interface IMaterialTrackingPPOrderDAO extends ISingletonService
{

	/**
	 * Deletes <all <code>C_Invoice_Detail</code> records that reference the given <code>ppOrder</code>.
	 *
	 * @param ppOrder
	 * @return the number of deleted records
	 */
	int deleteInvoiceDetails(I_PP_Order ppOrder);

	int deleteRelatedUnprocessedICs(I_PP_Order ppOrder);

	boolean isInvoiced(I_PP_Order ppOrder);

}
