package antlr;

/* ANTLR Translator Generator
 * Project led by Terence Parr at http://www.jGuru.com
 * Software rights: http://www.antlr.org/license.html
 *
 * $Id: TreeParserSharedInputState.java,v 1.1.1.1 2004-12-13 19:08:51 deronj Exp $
 */

/** This object contains the data associated with an
 *  input AST.  Multiple parsers
 *  share a single TreeParserSharedInputState to parse
 *  the same tree or to have the parser walk multiple
 *  trees.
 */
public class TreeParserSharedInputState {
    /** Are we guessing (guessing>0)? */
    public int guessing = 0;
}
