Information on the GraphView prototype

CAVEAT: 
This is a prototype. I am neither giving any warranty nor provide any support 
for this code. Use it at your own risk.


RATIONALE:
See 
  http://koehnlein.blogspot.com/2011/06/using-xbase-to-define-generic-graphical.html


LICENSE: 
The code is licensed under EPL 1.0. See 
  http://www.eclipse.org/legal/epl-v10.html 
for details.


EXAMPLES: 
The plugin org.eclipse.xtext.graphview.example contains example configs to be
used in a runtime workbench.


XTEXT INTEGRATION: 
To create views for your Xtext-based language, you have to 
 - add a dependency to org.eclipse.xtext.graphview.providers in the UI plugin of your 
   language
 - add the following entry in the plugin.xml of the UI plug-in of your language
   <extension point="org.eclipse.xtext.graphview.selectionStrategy">
      <strategy
           class="<<your language's full name>>ExtensionFactory:org.eclipse.xtext.graphview.providers.XtextEditorSelectionStrategy">
      </strategy>
   </extension>
 - add a dependency to your language's infrastructure plug-in in the runtime 
   plug-in containing the mapping and stylesheet files.
If you don't want to touch the Xtext plug-ins, you can contribute this by means
of a plug-in fragment. The projects
   org.eclipse.xtext.example.domainmodel.graphview and 
   org.eclipse.xtext.example.fowlerdsl.graphview
show you how to do that.


LAYOUTS:
To use layouts from the KIELER project 
   http://rtsys.informatik.uni-kiel.de/trac/kieler
you have to checkout some plug-ins from the KIELER repository. Use the 
   KIELER_projectSet.psf 
for a minimal configuration using OGDF and Dot layouts (need Graphviz installed).

