/*Added Switch to be able to run custom command in RuleMachine on Hubitat to create door/window/buzzer rules
*/
metadata {
    definition(
        name: 'Konnected Button Trigger',
        namespace: 'konnected',
        author: 'Konnected Inc.',
            /Edited by ScubamikeJax904
        singleThreaded: true,
        importUrl: 'https://raw.githubusercontent.com/scubamikejax904/konnected-hubitat/refs/heads/master/drivers/konnected%20button-trigger.groovy'
    ){
        capability "Momentary"
        capability "Switch"
    }
}

public void push(_) {
    parent?.componentPush(this.device)
}
