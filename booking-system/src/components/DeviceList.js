import React, { Component } from 'react';
import DeviceRow from './DeviceRow';
import data from '../data/deviceList.json'

class DeviceList extends Component {
  constructor(props) {
    super(props);
    
    this.state = {
        deviceList: data,
      }
  }

  render() {
    return (
      <div className="container main-content">
        {
          this.state.deviceList.map(device => {
            return <DeviceRow key={device.id} name={device.name} description={device.description} nextAvailable={device.nextAvailable} bookedBy={device.bookedBy} status={device.status} />
          })
        }
      </div>
    );
  }
}

export default DeviceList;