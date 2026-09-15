package org.quazilang.jetbrains

import com.intellij.openapi.fileTypes.LanguageFileType
import com.intellij.lang.Language
import javax.swing.Icon

object QuaziLanguage : Language("Quazi")

object QuaziFileType : LanguageFileType(QuaziLanguage) {
    override fun getName() = "Quazi"
    override fun getDescription() = "Quazi source file"
    override fun getDefaultExtension() = "qz"
    override fun getIcon(): Icon? = null
}
