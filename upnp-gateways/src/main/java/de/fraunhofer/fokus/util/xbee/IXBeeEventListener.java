/**
* 
* Copyright (C) 2004-2008 FhG Fokus
*
* This file is part of the FhG Fokus UPnP stack - an open source UPnP implementation
* with some additional features
*
* You can redistribute the FhG Fokus UPnP stack and/or modify it
* under the terms of the GNU General Public License Version 3 as published by
* the Free Software Foundation.
*
* For a license to use the FhG Fokus UPnP stack software under conditions
* other than those described here, or to purchase support for this
* software, please contact Fraunhofer FOKUS by e-mail at the following
* addresses:
*   upnpstack@fokus.fraunhofer.de
*
* The FhG Fokus UPnP stack is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
* GNU General Public License for more details.
*
* You should have received a copy of the GNU General Public License
* along with this program; if not, see <http://www.gnu.org/licenses/>
* or write to the Free Software Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA
*
*/
package de.fraunhofer.fokus.util.xbee;

import de.fraunhofer.fokus.upnp.util.network.listener.INetworkStatus;

/**
 * This interface must be implemented by classes which wants to get informed about XBee events.
 * 
 * @author Alexander Koenig
 * 
 * 
 */
public interface IXBeeEventListener
{

  /** Event that the local address has been retrieved */
  public void xbeeLocalAddressRetrieved(INetworkStatus sender);

  /** Event that an AT command was answered */
  public void xbeeATCommandResponseReceived(int frameID, String command, int status, byte[] value);

  /** Event that a TX response was sent */
  public void xbeeTXStatusReceived(int frameID, int status);

  /** Event that a modem status was sent */
  public void xbeeModemStatusReceived(int status);
}