/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

fun WGL_ARB_pixel_format_float() = "WGLARBPixelFormatFloat".nativeClassWGL("WGL_ARB_pixel_format_float", ARB) {
	javaDoc(
		"""
		Native bindings to the ${url("http://www.opengl.org/registry/specs/ARB/color_buffer_float.txt", templateName)} extension.

		This extension adds pixel formats with floating-point RGBA color components.
		"""
	)

	IntConstant.block(
		"""
		Accepted as a value in the {@code attribIList} parameter array of ${"WGLARBPixelFormat".link("ChoosePixelFormatARB()")}, and returned in the {@code values}
		parameter array of ${"WGLARBPixelFormat".link("GetPixelFormatAttribiARB()")}.
		""",

		"TYPE_RGBA_FLOAT_ARB" _ 0x21A0
	)

}