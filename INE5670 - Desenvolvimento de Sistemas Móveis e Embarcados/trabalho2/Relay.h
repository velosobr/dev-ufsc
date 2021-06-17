/** \addtogroup RelayModule 
 *  @{
 */

#ifndef RELAY_H
#define RELAY_H

#include "Switchable.h"

class Relay : public Switchable {
    public:
        Relay(const int pin);
};

#endif 

 