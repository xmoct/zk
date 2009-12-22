/* Div.js

	Purpose:
		
	Description:
		
	History:
		Sun Oct  5 00:20:23     2008, Created by tomyeh

Copyright (C) 2008 Potix Corporation. All Rights Reserved.

	This program is distributed under LGPL Version 3.0 in the hope that
	it will be useful, but WITHOUT ANY WARRANTY.
*/
zul.wgt.Div = zk.$extends(zul.Widget, {
	$define: {
		align: function (v) {
			var n = this.$n();
			if (n)
				n.align = v;
		}
	},
	//super//
	domAttrs_: function(no) {
		var align = this._align,
			attr = this.$supers('domAttrs_', arguments);
		return align != null ? attr + ' align="' + align + '"' : attr;
	}
});
