package com.crystallang;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.PsiManager;
import com.intellij.psi.search.*;
import com.intellij.psi.util.PsiTreeUtil;
import com.intellij.util.indexing.FileBasedIndex;
import com.crystallang.psi.*;

import java.util.*;

/**
 * Created by benoist, 06/02/2017
 */
public class CrystalUtil {
    public static List<CrystalProperty> findProperties(Project project, String key) {
        List<CrystalProperty> result = null;
        Collection<VirtualFile> virtualFiles =
                FileBasedIndex.getInstance().getContainingFiles(FileTypeIndex.NAME, CrystalFileType.INSTANCE,
                        GlobalSearchScope.allScope(project));
        for (VirtualFile virtualFile : virtualFiles) {
            CrystalFile simpleFile = (CrystalFile) PsiManager.getInstance(project).findFile(virtualFile);
            if (simpleFile != null) {
                CrystalProperty[] properties = PsiTreeUtil.getChildrenOfType(simpleFile, CrystalProperty.class);
                if (properties != null) {
                    for (CrystalProperty property : properties) {
                        if (key.equals(property.getKey())) {
                            if (result == null) {
                                result = new ArrayList<CrystalProperty>();
                            }
                            result.add(property);
                        }
                    }
                }
            }
        }
        return result != null ? result : Collections.<CrystalProperty>emptyList();
    }

    public static List<CrystalProperty> findProperties(Project project) {
        List<CrystalProperty> result = new ArrayList<CrystalProperty>();
        Collection<VirtualFile> virtualFiles =
                FileBasedIndex.getInstance().getContainingFiles(FileTypeIndex.NAME, CrystalFileType.INSTANCE,
                        GlobalSearchScope.allScope(project));
        for (VirtualFile virtualFile : virtualFiles) {
            CrystalFile simpleFile = (CrystalFile) PsiManager.getInstance(project).findFile(virtualFile);
            if (simpleFile != null) {
                CrystalProperty[] properties = PsiTreeUtil.getChildrenOfType(simpleFile, CrystalProperty.class);
                if (properties != null) {
                    Collections.addAll(result, properties);
                }
            }
        }
        return result;
    }
}